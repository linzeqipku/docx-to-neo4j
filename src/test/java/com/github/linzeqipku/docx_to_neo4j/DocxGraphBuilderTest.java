package com.github.linzeqipku.docx_to_neo4j;

import org.junit.Test;

import java.io.IOException;

public class DocxGraphBuilderTest {

    private static final String GRAPH_DIR_PATH="E:/tmp/graphdb";
    private static final String DOCX_DIR_PATH="E:/test/docxparser/html";

    @Test
    public void testDocxGraphBuilder() throws IOException {
        DocxGraphBuilder.process(GRAPH_DIR_PATH,DOCX_DIR_PATH);
    }

}