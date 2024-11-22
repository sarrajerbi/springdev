package com.sarra.salledesport.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sarra.salledesport.entities.Salledesport;
import com.sarra.salledesport.service.SalledesportService;
@Controller
public class SalledesportController {
@Autowired
SalledesportService salledesportService;
 @RequestMapping("/Listesalledesports")
public String listesalledesports(ModelMap modelMap)
{
List<Salledesport> salle = salledesportService.getAllSalledesports();
modelMap.addAttribute("salledesports", salle);
return "listesalledesports";
}
 @RequestMapping("/showCreate")
public String showCreate()
{
return "createsalledesport";
}
@RequestMapping("/savesalledesport")
public String savesalledesport(@ModelAttribute("salledesport") Salledesport salledesport,
@RequestParam("date") String date,
ModelMap modelMap) throws ParseException
{
//conversion de la date
 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
 Date dateCreation = dateformat.parse(String.valueOf(date));
 salledesport.setDatecreation(dateCreation);

Salledesport savesalledesport = salledesportService.saveSalledesport(salledesport);
String msg ="salledesport enregistré avec Id "+savesalledesport.getIdsalle();
modelMap.addAttribute("msg", msg);
return "createsalledesport";
}
}