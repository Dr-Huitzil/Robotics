/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.Robot;
import frc.robot.RobotMap;

public class DriveManuallyCommand extends Command {
    public DriveManuallyCommand() {
        // use requires here to declaer subsystem dependencies
        requires(Robot.driveSubsystem);
    }

    // called just before this command runs the first time
    @Override
    protected void initialize() {
    }

    // called repeatedly when this command is scheduled to run
    @Override
    protected void execute() {
        //System.out.println("Running..");
        double move = -Robot.m_oi.stick.getY();
        double turn = Robot.m_oi.stick.getX();
        Robot.driveSubsystem.manualDrive(move, turn);

    }

    // make this return true when this command no longer needs to run execute ()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // called out once after isfinished returns true
    @Override
    protected void end() {
    }

    // called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}