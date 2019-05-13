package com.example.ReviceAjax;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    public List<Emp> lst=new ArrayList<Emp>(Arrays.asList(
            new Emp(1,"java","12"),new Emp(2,"dot","12"),new Emp(3,"php","12")
    ));

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<Object>(new EmpRes<List<Emp>>(lst,"success"), HttpStatus.OK);
    }

    @RequestMapping(value = "/emp2",method = RequestMethod.GET)
    public ResponseEntity<Object> getA(){
        return new ResponseEntity<Object>(lst, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Emp getId(@PathVariable int id){
        return lst.get(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String add(@RequestBody Emp emp){
        lst.add(emp);
        System.out.println(emp.id+""+emp.name+""+emp.age);
        return "successfully added";
    }





}
