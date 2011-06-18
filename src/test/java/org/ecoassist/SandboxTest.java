package org.ecoassist;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Random;

public class SandboxTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SandboxTest.class);

    @Test
    public void randomShouldBeRandom() {
        int min = 0;
        int max = 36;
        Assert.assertNotSame(nextRandom(min, max), nextRandom(min, max));
    }


    @Test
    public void shouldReadLineXFromFile() throws Exception {
        String coordinates = "25.405647,45.097939 25.407694,45.097612 25.406153,45.094823 25.40548,45.094773 25.40478,45.094629 25.40419,45.094377 25.403693,45.093948 25.403398,45.093372 25.403318,45.09284 25.403438,45.092392 25.403721,45.092027 25.404295,45.091954 25.404833,45.092227 25.40542,45.092613 25.406028,45.092918 25.40785,45.092953 25.408704,45.092852 25.408872,45.092513 25.408905,45.091298 25.409131,45.090019 25.409058,45.089208 25.408213,45.088792 25.407444,45.088583 25.407559,45.088346 25.407851,45.088103 25.408169,45.087846 25.40841,45.087431 25.407946,45.087209 25.404951,45.086411 25.404537,45.086675 25.404716,45.087069 25.405671,45.087474 25.40574,45.087956 25.405495,45.088295 25.404995,45.088455 25.403111,45.088163 25.402963,45.088449 25.403272,45.088772 25.404366,45.089202 25.404509,45.089514 25.404137,45.089846 25.40368,45.089862 25.403148,45.089796 25.40279,45.089656 25.402413,45.089296 25.401994,45.089051 25.400095,45.089484 25.399688,45.089285 25.399238,45.089035 25.398845,45.088994 25.398241,45.089053 25.398022,45.089387 25.398776,45.09171 25.399317,45.091875 25.399593,45.092248 25.39961,45.09255 25.398635,45.095388 25.399267,45.095047 25.399686,45.095057 25.400119,45.095477 25.40166,45.094868 25.402188,45.095074 25.402549,45.095349 25.402801,45.095658 25.40302,45.095999 25.402403,45.096917 25.402724,45.097272 25.405022,45.098033 25.405647,45.097939";
        Assert.assertEquals(coordinates, getLineFromStream(getClass().getResourceAsStream("/coordinates.txt"), 10));
    }

    private String getLineFromStream(InputStream inputStream, int expectedLineNumber) throws FileNotFoundException {
        LineIterator it = IOUtils.lineIterator(new BufferedReader(new InputStreamReader(inputStream)));
        for (int lineNumber = 0; it.hasNext(); lineNumber++) {
            String line = (String) it.next();
            if (lineNumber == expectedLineNumber) {
                return line;
            }
        }
        return null;
    }

    private int nextRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
