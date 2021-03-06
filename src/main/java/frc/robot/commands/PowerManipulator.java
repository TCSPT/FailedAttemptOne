/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;


public class PowerManipulator extends Command {
  public PowerManipulator() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.manipulator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.manipulator.runManipulator(0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (OI.controllerOne.getRawButton(5) && Robot.beam.getBeam() == true){
      Robot.manipulator.runManipulator(0.75);
    } else if (OI.controllerOne.getRawButton(6) && Robot.beam.getBeam() == true){
      Robot.manipulator.runManipulator(0.75);
    } else {
      Robot.manipulator.runManipulator(0);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.manipulator.runManipulator(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}