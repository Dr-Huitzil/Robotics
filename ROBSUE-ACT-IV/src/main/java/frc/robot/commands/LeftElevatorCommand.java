/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LeftElevatorCommand extends Command {
   double speed;
   
  public LeftElevatorCommand(double speed)
  {
    this.speed = speed;
    requires(Robot.elevatorSubsystem);

    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.elevatorSubsystem.setLeft(0.0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {
    Robot.elevatorSubsystem.setLeft(speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.elevatorSubsystem.setLeft(0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}