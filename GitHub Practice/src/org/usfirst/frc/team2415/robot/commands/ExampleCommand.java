
package org.usfirst.frc.team2415.robot.commands;

import java.util.ArrayList;

import org.usfirst.frc.team2415.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExampleCommand extends Command {
	
	ArrayList<Integer> numArray = new ArrayList<Integer>();
	int randInt, closestNum;
	int iramoVar = 55;
	boolean done = false;

    public ExampleCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.exampleSubsystem);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	randInt = (int)(Math.random()*100);
    	
        numArray.add(iramoVar);
        
        int minDiff = randInt - numArray.get(0);

    	for(int i = 0; i < numArray.size(); i++){
    		int diff = randInt - numArray.get(i);
    		if(Math.abs(minDiff) < Math.abs(diff)){
    			minDiff = diff;
    			closestNum = numArray.get(i);
    		}
    	}
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	done = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("The Target was " + randInt + ". The person(s) who guessed " + closestNum + " is the winner!");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
