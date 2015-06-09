package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.SkillModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * Created by Valentin Montmirail on 01/03/2015.
 */
@Named("cv")
@ApplicationScoped
public class SkillController extends TableController {

    private static final long serialVersionUID = 0x2c544343430L;
    
    public SkillController() {

        tableModel = new SkillModel();
    }
    
    public ArrayList<String> getSkills() {

        return ((SkillModel)tableModel).getSkills();
    }

    public ArrayList<String> getValues() {

        return ((SkillModel)tableModel).getValues();
    }

    public String getSkill(int i) {

        return ((SkillModel)tableModel).getSkills().get(i);
    }
    
    public String getValue(int i) {

        return ((SkillModel)tableModel).getValues().get(i);
    }
    
    public String getColor(int i) {
        
        return ((SkillModel)tableModel).getColors().get(i);
    }
    
    public String getSoftware() {

        return new Integer(Integer.parseInt(((SkillModel)tableModel).getNbSoftware()) -1).toString();
    }
    
    public String getNext(String previous) {
        
        return new Integer(Integer.parseInt(previous) +1).toString();
    }

    public String getLanguage() {

        Integer i = new Integer(Integer.parseInt(((SkillModel)tableModel).getNbLanguage()) -1);
        return i.toString();
    }

    public String getManagement() {

        Integer i = new Integer(Integer.parseInt(((SkillModel)tableModel).getNbManagement()) -1);
        return i.toString();
    }

    public String getDatabase() {

        Integer i = new Integer(Integer.parseInt(((SkillModel)tableModel).getNbDatabases()) -1);
        return i.toString();
    }

    public String getWeb() {

        Integer i = new Integer(Integer.parseInt(((SkillModel)tableModel).getNbWeb()) -1);
        return i.toString();
    }
}
