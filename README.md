# docx-to-neo4j

### Usage example

1. Convert .docx files to .html files using [this gist](https://gist.github.com/linzeqipku/3cec0b90e9e51445a2ffc5e15cdf4ae0)

2. Parse .html files using:

    ``
DocxGraphBuilder.process(GRAPH_DIR_PATH,DOCX_DIR_PATH);
``

    see [the test case](https://github.com/linzeqipku/docx-to-neo4j/blob/master/src/test/java/com/github/linzeqipku/docx_to_neo4j/DocxGraphBuilderTest.java).

### Maven

Add this repository in your ``pom.xml`` file:

```
<repositories>
    <repository>
        <id>linzeqipku-public-snapshots</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/snapshots</url>
    </repository>
    <repository>
        <id>linzeqipku-public-releases</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/releases</url>
    </repository>
</repositories>
```

Add the maven dependence:

```
<dependencies>
    <dependency>
        <groupId>com.github.linzeqipku</groupId>
        <artifactId>docx-to-neo4j</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```
