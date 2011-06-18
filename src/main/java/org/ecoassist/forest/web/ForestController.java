package org.ecoassist.forest.web;

import org.ecoassist.forest.domain.Forest;
import org.ecoassist.forest.domain.Forests;
import org.ecoassist.forest.service.ForestException;
import org.ecoassist.forest.service.ForestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;

@Controller
@RequestMapping("/*")
public class ForestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForestController.class);

    @Autowired
    @Qualifier("mockForestService")
    private ForestService forestService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderIndex(ModelMap model) throws IOException, JAXBException {
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String renderHome(ModelMap model) throws IOException, JAXBException {
        return "home";
    }

    @RequestMapping(value = "/tech", method = RequestMethod.GET)
    public String renderTech() {
        return "tech";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String renderAbout() {
        return "about";
    }

    @RequestMapping(value = "/forest-check", method = RequestMethod.GET)
    public String renderForestCheck() throws IOException, JAXBException {

        //model.put("forests", forestService.getAllForests());

/*        Forests forests = getForests(new StreamSource(new InputStreamReader(getClass().getResourceAsStream("/pucioasa-forests.kml"))));
        LOGGER.debug("Forests: {}", forests);
        for (Forest forest : forests.getForests()) {
            forestService.save(forest);
        }*/
        return "forest-check";
    }

    @RequestMapping(value = "/forest-check", method = RequestMethod.POST)
    public String handleForestCheck(@RequestParam("verdict") Boolean verdict) throws IOException, JAXBException {
        LOGGER.debug("hey, post! with verdict={}", verdict);
        return "forest-check";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderHomeWithId(@PathVariable final String id, ModelMap model) throws IOException, JAXBException {
        model.put("forests", forestService.getAllForests());
        //model.put("forest", forestService.getForest(id));
        return "home";
    }

    @RequestMapping(value = "/{id}/forest.kml", method = RequestMethod.GET)
    /*@ResponseBody*/
    public String renderTech(@PathVariable final String id, ModelMap model) {
        Forest forest = forestService.getForest(id);
        model.put("coordinates", forest.getCoordinates());
        //todo: render xml
        return "forest-kml";
    }

    @RequestMapping(value = "/forest.kml", method = RequestMethod.GET)
    public String renderRandomForest(ModelMap model) throws ForestException {
        Forest forest = forestService.getRandomForest();
        model.put("coordinates", forest.getCoordinates());
        return "forest-kml";
    }

    protected Forests getForests(final StreamSource source) throws JAXBException, IOException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(Forests.class);
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setEventHandler(new DefaultValidationEventHandler());
        final JAXBElement<Forests> root = unmarshaller.unmarshal(source, Forests.class);
        return root.getValue();
    }



}