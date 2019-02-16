/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;


public class DriveSystem extends Subsystem {
  public WPI_TalonSRX frontLeftDrive;
  public WPI_TalonSRX frontRightDrive;
  public WPI_TalonSRX rearRightDrive;
  public WPI_TalonSRX rearLeftDrive; 
  public DifferentialDrive robotDrive;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  SpeedControllerGroup leftSideDrive;
  SpeedControllerGroup rightSideDrive;
  public DriveSystem() {
    frontLeftDrive = new WPI_TalonSRX (RobotMap.FLD);
    frontRightDrive = new WPI_TalonSRX (RobotMap.FRD);
    rearRightDrive = new WPI_TalonSRX (RobotMap.RRD);
    rearLeftDrive = new WPI_TalonSRX(RobotMap.RLD);
  
    leftSideDrive = new SpeedControllerGroup(frontLeftDrive, rearLeftDrive);
    rightSideDrive = new SpeedControllerGroup(frontRightDrive, rearRightDrive);

    robotDrive = new DifferentialDrive(leftSideDrive, rightSideDrive);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
