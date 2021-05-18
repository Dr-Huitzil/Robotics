package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.BallManuallyCommand;

public class BallSubsystem extends Subsystem {



    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      setDefaultCommand(new BallManuallyCommand());
    }

}