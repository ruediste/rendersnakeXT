# RendersnakeXT

[![Build Status](https://travis-ci.org/ruediste/rendersnakeXT.svg)](https://travis-ci.org/ruediste/rendersnakeXT)

eXTensible library to create HTML using only Java inspired by [Rendersnake](https://github.com/emicklei/rendersnake)

## Overview
Traditional approaches to generating HTML typically involve some kind of templating language (velocity, jsp, ...). They generally suffer from limited tool support and cumbersome integration of java code snippets needed to include dynamic content. Rendersnake and RendersnakeXT use an embedded DSL to generate HTML, which addresses these issues.

Rendersnake has been written with highest possible performance in mind and sacrificed flexibility for it. RendersnakeXT uses a slightly different syntax and is built for extensibility leveraging the new default implementations of interface methods, introduced with Java 8. Benchmarks show a very moderate speed penalty for this approach (execution time of RendersnakeXT is around 120 per cent of Rendersnake in a simple benchmark).

## Examples
```java
SimpleCanvas html = new SimpleCanvas();
html
  .html()
    .body()
       .h1().content("Hello Coder")
    ._body()
  ._html();
System.out.println(html.toHtml());
```

Example of a complex Form element to pick one of four options
```java
//@formatter:off
html.div().DATA("role","fieldcontain")
.fieldset().DATA("role","controlgroup").DATA("type","horizontal")
    .legend().content("Method")
    .input().TYPE("radio").NAME("method").ID("radio-get").VALUE("method-get").CHECKED("checked").ONCHANGE("clickedMethod(this.value);")
    .label().FOR("radio-get").content("GET")

    .input().TYPE("radio").NAME("method").ID("radio-post").VALUE("method-post").CHECKED("checked").ONCHANGE("clickedMethod(this.value);")
    .label().FOR("radio-post").content("POST")
    
    .input().TYPE("radio").NAME("method").ID("radio-put").VALUE("method-put").CHECKED("checked").ONCHANGE("clickedMethod(this.value);")
    .label().FOR("radio-put").content("PUT")
    
    .input().TYPE("radio").NAME("method").ID("radio-delete").VALUE("method-delete").CHECKED("checked").ONCHANGE("clickedMethod(this.value);")
    .label().FOR("radio-delete").content("DELETE")
._fieldset()
._div();
//@formatter:on
```

## Getting Started
First, add the maven dependency

    <dependency>
      <groupId>com.github.ruediste.rendersnakeXT</groupId>
      <artifactId>rendersnakeXT</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>

Then create a simple `HtmlCanvas` class:

```java
class SimpleCanvas extends HtmlCanvasBase<SimpleCanvas> 
  implements Html5Canvas<SimpleCanvas> {
  private StringWriter writer;

  public BenchmarkCanvas() {
    initialize(writer);
  }

  public String toHtml() {
    return writer.toString();
  }
}
```

Now you are ready to create HTML canvases and write html as outlined above.

## Customizing the HTML canvas
You can add any function you like to your canvas class. In addition, there are some built-in mix-in style interfaces:

  * `FuncCanvas`: provides functional utility methods, allowing you to use loops and conditionals inline
  * `BootstrapCanvas`: helper functions to create bootstrap code

Mix-in interfaces are easy to write: just create an interface (take `FuncCanvas` as template) and add methods with a default implementation. To do something which requires state, or to inject dependencies, add a `internal_YOUR_UTILITY()` function which returns a utility providing the necessary functionality, and provide it from your canvas class. 

## Updating the HTML5 Canvas
To update to the latest version of the whatwg html standard, simply do

    cd src/test/resources/com/github/ruediste/rendersnakeXT
    rm index.html
    wget html.spec.whatwg.org

And then open the `Generator` class and run it as java application from your IDE.