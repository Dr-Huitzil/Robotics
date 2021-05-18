package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.LiftManuallyCommand;

public class LiftSubsystem extends Subsystem {



    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      setDefaultCommand(new LiftManuallyCommand());
    }

}