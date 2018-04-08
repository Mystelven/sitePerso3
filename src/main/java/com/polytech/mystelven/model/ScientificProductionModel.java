package com.polytech.mystelven.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 03/03/2015.
 */
public class ScientificProductionModel extends TableModel {

    private static final long serialVersionUID = 0x2543c46d87L;

    private static ScientificProductionModel INSTANCE = new ScientificProductionModel();

    /* The class ExperienceModel is a Singleton, we don't need multi-instance to perform requests */
    public static ScientificProductionModel getProjectModel() { return INSTANCE; }

    private ArrayList<String> descriptions;

    private ArrayList<String> images;

    private ArrayList<String> names;

    private ArrayList<String> datesProject;

    private ArrayList<String> categories;

    private ArrayList<String> ids;

    private ScientificProductionModel() {
        
        log().info("ProjectModel() -- IN");

        log().info("ProjectModel() -- OUT");
        
    }

    public String getNbProject() {

        this.getAll();

        return Integer.toString(names.size());
    }

    public ArrayList<String> getNames() {

        log().info("getNames() -- IN");

        if(names == null) {
            this.getAll();
        }

        log().info("getNames() -- OUT");
        
        return names;
    }
    
    public ArrayList<String> getDescriptions() {

        log().info("getDescriptions() -- IN");

        if(descriptions == null) {
            this.getAll();
        }

        log().info("getDescriptions() -- OUT");

        return descriptions;
    }

    public ArrayList<String> getDateProject() {

        log().info("getDateProject() -- IN");

        if(datesProject == null) {
            this.getAll();
        }

        log().info("getDateProject() -- OUT");

        return datesProject;
    }

    public ArrayList<String> getCategory() {

        log().info("getCategories() -- IN");

        if(categories == null) {
            this.getAll();
        }

        log().info("getCategories() -- OUT");

        return categories;
    }

    public void getAll() {

        names                   = new ArrayList<String>();
        images                  = new ArrayList<String>();
        descriptions            = new ArrayList<String>();
        datesProject            = new ArrayList<String>();
        categories              = new ArrayList<String>();
        ids                     = new ArrayList<String>();

        names.add("Planning to S5");
        names.add("MoSaiC");
        names.add("Tweet Classifier");
        names.add("S52SAT");
        names.add("Stabilisation of a nacelle");
        names.add("MDK-Verifier");
        names.add("Contributions to SATLive!");
        names.add("Generalized Lights Out");

        images.add("resources/projet/Planning.png");
        images.add("resources/projet/mosaic.png");
        images.add("resources/projet/tweetAnalyser.png");
        images.add("resources/projet/S52SAT.png");
        images.add("resources/projet/nacelle.png");
        images.add("resources/projet/mdk-verifier.png");
        images.add("resources/projet/satLive.png");
        images.add("resources/projet/Interrupteur.png");

        descriptions.add("Planning to S5 is translating a PDDL instance with uncertainties about the initial state into an InToHyLo instance that should be considered as a modal logic S5 problem|End|.<br/>The tool, written in C++, is accessible here: <a href=\"http://www.cril.univ-artois.fr/~montmirail/planning-to-s5/\">http://www.cril.univ-artois.fr/~montmirail/planning-to-s5/</a>");
        descriptions.add("MoSaiC is a <a href=\"recar\">RECAR</a> approach for solving the Modal Logic K Satisfiability Problem.<br/>The solver, written in C++, is accessible here: <a href=\"http://www.cril.univ-artois.fr/~montmirail/mosaic/\">http://www.cril.univ-artois.fr/~montmirail/mosaic/</a>|End|<br/><br/>The RECAR approach definitely increase the performance compared to a simple <a href=\"https://link.springer.com/chapter/10.1007/10722167_15\">CEGAR</a> approach<br/><div>\t<img title=\"Scatter-plot CEGAR vs RECAR\" alt=\"Scatter-plot CEGAR vs RECAR\" src=\"resources/projet/Cegar-vs-Mosaic.png\" width=\"500\" height=\"300\"/></div><br/>MoSaiC is also very competitive against the state-of-the-art solver for Moda Logic K Satisfiability Problem<br/><div>\t<img title=\"Cactus-Plot MoSaiC againt others\" alt=\"Cactus-Plot MoSaiC againt others\" src=\"resources/projet/Cactus-ALL.png\" width=\"500\" height=\"300\"/></div>");
        descriptions.add("Learning-ception: I wanted to learn how to use Machine Learning and Natural Language Processing in practice.This program can classify tweets on a topic (passed in argument) on 3 levels ''positive'', ''negative'' and ''neutral''.|End|<br />The illustration represents what Twitter was thinking about Trump at the date of 05/06/2017 at 14:12, with the following classification:<br/><pre>[0.956, 0.836, 0.836, 0.825, 0.781, 0.78, 0.758, 0.754, 0.728, 0.697, 0.684, 0.683, 0.683, 0.675, 0.649, 0.645, 0.644, 0.642, 0.617, 0.603, 0.603, 0.599, 0.59, 0.576, 0.548, 0.548, 0.533, 0.523, 0.518, 0.517, 0.516, 0.512, 0.507, 0.506, 0.504, 0.504, 0.501, 0.5, 0.5, 0.486, 0.483, 0.48, 0.461, 0.455, 0.455, 0.447, 0.447, 0.447, 0.447, 0.445, 0.444, 0.444, 0.442, 0.442, 0.433, 0.421, 0.421, 0.421, 0.421, 0.407, 0.407, 0.402, 0.4, 0.399, 0.396, 0.372, 0.366, -0.348, -0.356, -0.371, -0.376, -0.376, -0.376, -0.379, -0.383, -0.391, -0.393, -0.396, -0.399, -0.399, -0.399, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.401, -0.402, -0.404, -0.406, -0.406, -0.408, -0.41, -0.413, -0.415, -0.419, -0.419, -0.419, -0.419, -0.419, -0.421, -0.424, -0.426, -0.426, -0.426, -0.426, -0.426, -0.427, -0.431, -0.434, -0.435, -0.436, -0.436, -0.437, -0.439, -0.442, -0.443, -0.444, -0.444, -0.444, -0.446, -0.447, -0.45, -0.455, -0.456, -0.456, -0.459, -0.459, -0.46, -0.461, -0.462, -0.465, -0.465, -0.465, -0.465, -0.465, -0.466, -0.467, -0.469, -0.47, -0.471, -0.473, -0.475, -0.475, -0.477, -0.479, -0.481, -0.481, -0.482, -0.487, -0.487, -0.487, -0.489, -0.49, -0.505, -0.505, -0.505, -0.505, -0.505, -0.506, -0.508, -0.51, -0.516, -0.518, -0.518, -0.524, -0.524, -0.528, -0.53, -0.538, -0.538, -0.538, -0.538, -0.544, -0.544, -0.544, -0.544, -0.545, -0.548, -0.549, -0.549, -0.558, -0.559, -0.565, -0.572, -0.572, -0.572, -0.572, -0.575, -0.575, -0.576, -0.576, -0.576, -0.576, -0.58, -0.586, -0.592, -0.599, -0.608, -0.608, -0.608, -0.608, -0.608, -0.611, -0.613, -0.615, -0.615, -0.634, -0.635, -0.635, -0.635, -0.643, -0.657, -0.662, -0.67, -0.67, -0.685, -0.685, -0.686, -0.718, -0.729, -0.729, -0.734, -0.738, -0.738, -0.758, -0.76, -0.77, -0.789, -0.809, -0.815, -0.815, -0.815, -0.815, -0.823, -0.869, -0.882, -0.929, -0.964, -0.978]The strongest negative  :  -0.978The strongest positive  :   0.956The median value        :  -0.439The average value       :  -0.239Which can somehow be interpreted as ''globally, Twitter is against, but when people are for him, they are strongly for him''</pre><br />Feel free to contribute to this project on GitHub: <a href=\"https://github.com/Mystelven/tweet-classifier\">https://github.com/Mystelven/tweet-classifier</a>");
        descriptions.add("<br/>S52SAT is a SAT-based approach for solving the modal logic S5 satisfiability problem.It is able to give in output the S5-model, when the formula is satisfiable.<br/>The source code, written in C++ is accessible here: <a href=\"http://www.cril.univ-artois.fr/~montmirail/s52SAT/\">http://www.cril.univ-artois.fr/~montmirail/s52SAT/</a>");
        descriptions.add("<br/>Project performed in partnership with <a href=\"mailto:alain.krok@etu.univ-tours.fr\">Alain Krok</a>. The goal of this project was to copy what Nature is able to do since thousands of years: <b>Stabilized the view</b>.<br /> |End|<br/><h2>Small historic of the state-of-the-art</h2><br/><u><span>Nacelle with servomotors</span></u><br/><br/>The first model available to the public at a reasonable cost is the nacelle with servomotors.<br/>This system is composed with a nacelle actioned by two servomotors allowing a stabilization on the axis forward-backward and left-right.<br/><br/>These two servomotors are connected and powered directly by the main card of the drone.<br/>Thus, the nacelle uses the couple gyro-accelerometer of the main card to perform the necessary calculation for the positioning of the nacelle perfectly straight. <br/><br/>The orders are then transmitted to the servomotors which move the platform of the nacelle. The following Figure shows an example of nacelle with servomotors:<br/><br/><div>\t<img title=\"Nacelle with servomotors\" alt=\"Nacelle with servomotors\" src=\"resources/projet/nacelle_servo.jpg\" width=\"500\" height=\"300\"/></div><br/>Despite its cost relatively low, <b>this system suffers from two majors default</b>:<ul>\t<li>\t\tThe reaction time and the precision of the servomotors: when there is violent movements, the nacelle is very slow to come back to its initial position.\t</li>\t<li>\t\tDependency to the main card: the calculations are distributed and the main battery is requested. \t\t</li></ul><br/><u><span>Nacelle with brushless motors</span></u><br/><br/>Nacelles with brushless motors are composed with two majors elements:<ul>\t<li>\t\tA support on which the two brushless motors are fixed.\t</li>\t<li>\t\tA dedicated card to perform the calculation and also a captor giving the informations of the position-orientation of the card.\t</li></ul><div>\t<img title=\"Nacelle with brushless motors\" alt=\"Nacelle with brushless motors\" src=\"resources/projet/nacelle_moteurs.jpg\" width=\"500\" height=\"300\" /></div><br/>This new version corrects the problems that suffer the nacelle with servomotors. <br/>The cost is relatively higher (approx. 200 euros for the metallic support plus the motors and between 40 and 100 euros for the main card and the captors).<br/>This system is thus entirely independent and compatible with every types of drones.<br/><br/>To stabilize a nacelle, we need to enslave it. For this purpose, we used the famous regulation method: <b>the PID method</b><br/><br/><h2>Slaving by the PID method</h2><br/>As stated before, to solve this slaving problem, we used a regulation method. The most used one is the PID method.<br/><div>\t<img title=\"PID method\" alt=\"PID method\" src=\"resources/projet/pid.png\" width=\"500\" height=\"300\" /></a></div>The principle of the PID regulation is to modify intentionally the value of the deviation measured between the setpoint and the current position.<br/><br/><h3>P - Proportional </h3>The principle of a proportional regulation is to increase virtually the value of the error. <br/>Thus the system will react quickly to the changes of positions. <br/>On the other hand, if this value is too amplified, the system will become unstable.<div>\t<img title=\"P regulation\" alt=\"Curves of the P regulation\" src=\"resources/projet/P.png\" width=\"500\" height=\"300\" /></div><br /><br /><h3>I - Integral </h3>It is possible to add to the proportional regulation, the integral of the error. We obtain a PI regulation.<br/>The error between the setpoint and the current position is integrated with respect to the time, and multiplied by a constant which must be determined according to the system.<br /><br />This functionality is added because when the system gets closer to the setpoint, the error is not big enough to be corrected. <br/>The static error is thus compensated, and a more stable system is obtained in steady state.<div><img title=\"PI regulation\" alt=\"Curves of the PI regulation\" src=\"resources/projet/I.png\" width=\"500\" height=\"300\" /></div><br /><br /><h3>D - Derivation </h3>Finally, we can add a last term. It is the derivative of the error between the setpoint and the current position with respect to the time, and to multiply it by a constant.<br /><br />We add this last functionality because the PI regulation can lead to an overrun of the setpoint. <br/>This is limited by the derivative. When the system approaches the setpoint, the setpoint is braked by adding a force in the opposite direction. <br/>The stabilization is thus faster.<div><img title=\"PID regulation\" alt=\"Curves of the PID regulation\" src=\"resources/projet/D.png\" width=\"500\" height=\"300\" /></div><br /><br /><h3>Animation of PID</h3>Here is now a small animation on how these three parameters affects the position of the drone<div><img title=\"PID animation\" alt=\"\" src=\"resources/projet/PID_Animated.gif\" width=\"500\" height=\"300\" /></div<br /><br /><h2>Conclusion</h2><div style=\"text-align:center;\"><iframe width=\"560\" height=\"315\" src=\"//www.youtube.com/embed/OzAlos7IiE8\" frameborder=\"0\" allowfullscreen></iframe></div><br/>As you can see on this video, the camera is perfectly stable, no matter the movements made by the drone.<br/>This came from the fact that at each force applied on the camera, an opposite force is send in the motors by the Arduino card to cancel it.<br/>Thus, for every movement, an opposite force is applied and thus, the camera stays at the setpoint.");
        descriptions.add("MDK-verfier is, with some specifications in the I/O, able to tell if a Kripke model satisfies a formula for the modal logic K.The source code, written in C++ is accessible here: <a href=\"http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/\">http://www.cril.univ-artois.fr/~montmirail/mdk-verifier/</a>");
        descriptions.add("SAT Live! is a community web site to share news about SAT: conferences, workshops, software, benchmarks, positions, etc.|End|<br /><br />This project was initialized by Daniel Le Berre.<br /><br /><a target=\"_blank\" href=\"http://www.satlive.org/\">SAT Live!</a> is powered by Jekyll and it''s content can be found on GitHub since December 2014.<br /><br />GitHub : <a target=\"_blank\" href=\"https://github.com/satlive/website/\">https://github.com/satlive/website/</a>.<br /><br />I''m participating in this project by adding news about Modal-SAT in particular and by being one of developers who add new visual features.");
        descriptions.add("Project created in tandem with Florent Dewez and Thibault Defourneau.<br /><br />Lights Out is an electronic game, released by Tiger Electronics in 1995.<br />The game consists of a 5 by 5 grid of lights. When the game starts, a random number or a stored pattern of these lights is switched on.|End|<br /><br />Pressing any of the lights will toggle it and the adjacent lights. <br />The goal of the puzzle is to switch all the lights off, preferably in as few button presses as possible.<br /><br />We generalized this game by a N*M board, and not only : <img src=\"resources/lights/smallRules.png\" /><br />but also with P colors : <img src=\"resources/lights/fullRules.png\" /><br /><br />We created 2 Artificial Intelligences : one based on the method of Branch and Bound and the other based on the resolution of a system : AX + B = 0<br/><br />The solution ends up just being a matrix inversion problem Ax=B. <br />A would be your kernel matrix (it would be square if you use all the lights), B would be the \"on\" lights, and x would be the switches you need to hit in order to turn them off.<br /><br />The source code is accessible on <a target=\"_blank\" href=\"https://github.com/Mystelven/LightsOuts-Math\">GitHub</a>.<br /><br />Website who support this project : <a target=\"_blank\" href=\"http://mystelven.github.io/LightsOuts-Math/\">here</a>.");

        datesProject.add("2018-03-20");
        datesProject.add("2017-08-19");
        datesProject.add("2017-06-05");
        datesProject.add("2017-02-04");
        datesProject.add("2014-01-30");
        datesProject.add("2016-06-30");
        datesProject.add("2015-07-01");
        datesProject.add("2015-03-09");

        categories.add("C++");
        categories.add("C++");
        categories.add("Java");
        categories.add("C++");
        categories.add("Arduino");
        categories.add("C++");
        categories.add("Jekyll");
        categories.add("Java");

        ids.add("46");
        ids.add("45");
        ids.add("44");
        ids.add("43");
        ids.add("42");
        ids.add("41");
        ids.add("40");
        ids.add("39");
    }

    public ArrayList<String> getImages() {

        log().info("getImages() -- IN");

        if(images == null) {
            this.getAll();
        }

        log().info("getImages() -- OUT");

        return images;
    }

    public ArrayList<String> getId() {

        log().info("getId() -- IN");

        if(ids == null) {
            this.getAll();
        }

        log().info("getCategories() -- OUT");

        return ids;
    }
}
