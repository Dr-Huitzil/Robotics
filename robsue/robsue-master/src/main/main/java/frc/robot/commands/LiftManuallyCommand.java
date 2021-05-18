package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.Robot;
import frc.robot.RobotMap;
public class LiftManuallyCommand extends Command {

    public LiftManuallyCommand() {
        // use requires here to declare subsystem dependencies
        requires(Robot.liftSubsystem);
    }

    // called just before this command runs the first time
    @Override
    protected void initialize() {
    }

    //called repeatedly when this command is scheduled to run
    @Override
    protected void execute() {
    
        if(Robot.m_oi.stick.getAxis(AxisType.kZ) > 0) {
            System.out.println("Trigger A1: " + Robot.m_oi.stick.getAxis(AxisType.kZ));
        }
        if(Robot.m_oi.stick.getAxis(AxisType.kTwist) > 0) {
            System.out.println("Trigger A2: " + Robot.m_oi.stick.getAxis(AxisType.kTwist));
        }

    }    

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
    protected void interrupted () {
        end();
    }
}