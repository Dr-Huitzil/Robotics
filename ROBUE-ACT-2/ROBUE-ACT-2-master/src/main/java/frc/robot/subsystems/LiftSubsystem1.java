package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class LiftSubsystem1 extends Subsystem {

  // instatiate new motor controller objects
  public WPI_VictorSPX Killer_Queen = new WPI_VictorSPX(RobotMap.somethingPort);

  public void setSpeed (double speed) {
    Killer_Queen.set(ControlMode.PercentOutput, speed);
  }

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      //setDefaultCommand(new BallManually());
    }

}