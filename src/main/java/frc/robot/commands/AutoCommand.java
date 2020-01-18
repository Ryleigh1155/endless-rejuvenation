/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Vision;

/**
 * An example command.  You can replace me with your own command.
 */
public class AutoCommand extends CommandBase {
  DriveTrain dr;
  String direction;

  public AutoCommand(DriveTrain drive) {
    this.dr = drive;
    this.direction = direction;
  }
  // private double convert(double percent) {

  // }%
  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }
  
  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    double feet = 1;
    if (Robot.right_encoder.get() < 225) {
      dr.tankDrive(0.29, 0.29);
    }
  }
  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {
      System.out.print("");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  
}