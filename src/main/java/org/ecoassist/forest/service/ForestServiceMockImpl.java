package org.ecoassist.forest.service;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.ecoassist.forest.domain.Forest;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

@Service(value = "mockForestService")
public class ForestServiceMockImpl implements ForestService {
    @Override
    public void save(Forest forest) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Forest getRandomForest() throws ForestException {
        final Forest forest = new Forest();
        try {
            forest.setCoordinates(getLineFromStream(getClass().getResourceAsStream("/coordinates.txt"), nextRandom(0, 35)));
        } catch (FileNotFoundException e) {
            throw new ForestException(e);
        }
        return forest;
    }

    @Override
    public Forest getForest(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Forest> getAllForests() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    private int nextRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
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
}
