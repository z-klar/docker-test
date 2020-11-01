package cz.zk.dockertest.controller;

import cz.zk.dockertest.GlobalData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j

@RestController
@RequestMapping(value="main")
public class MainCOntroller {

    @Autowired
    private GlobalData globalData;

    @RequestMapping(value="/")
    public ResponseEntity<Object> MainResponse() {
        return new ResponseEntity<>("Main response OK", HttpStatus.OK);
    }

    @RequestMapping(value="/params")
    public ResponseEntity<Object> GetParams() {
        String s = "Param1: " + globalData.getParam1();
        s += " \nParam2: " + globalData.getParam2();
        s += " \nParam3: " + globalData.getParam3();
        log.info("Info message !!!");
        log.debug("DEBUG message !!!");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }


}
