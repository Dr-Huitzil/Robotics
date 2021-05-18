package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class BallSubsystem extends Subsystem {

  // instatiate new motor controller objects
  public WPI_VictorSPX motorSnirby = new WPI_VictorSPX(RobotMap.intakePort);

  public void set (double speed) {
    motorSnirby.set(ControlMode.PercentOutput, speed);
  }

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      //setDefaultCommand(new BallManually());
    }

}