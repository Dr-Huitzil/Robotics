package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.Robot;
import frc.robot.RobotMap;
public class LiftManuallyCommand extends Command {

    public LiftManuallyCommand() {
        // use requires here to declaer subsystem dependencies
        requires(Robot.liftSubsystem);
    }

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
}