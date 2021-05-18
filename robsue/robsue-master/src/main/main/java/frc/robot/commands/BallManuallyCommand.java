package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.Robot;

public class BallManuallyCommand extends Command {

    public BallManuallyCommand() {
        // use requires here to declaer subsystem dependencies
        requires(Robot.ballSubsystem);
    }

    @Override
    protected void execute() {
        // Button start at 1, not 0.
        if(Robot.m_oi.stick.getRawButtonPressed(1)) {
            System.out.println("Button: " + 1);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(2)) {
            System.out.println("Button: " + 2);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(3)) {
            System.out.println("Button: " + 3);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(4)) {
            System.out.println("Button: " + 4);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(5)) {
            System.out.println("Button: " + 5);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(6)) {
            System.out.println("Button: " + 6);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(7)) {
            System.out.println("Button: " + 7);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(8)) {
            System.out.println("Button: " + 8);
        }
        if(Robot.m_oi.stick.getRawButtonPressed(9)) {
            System.out.println("Button: " + 9);
        }

    }    

    @Override
    protected boolean isFinished() {
        return false;
    }
}