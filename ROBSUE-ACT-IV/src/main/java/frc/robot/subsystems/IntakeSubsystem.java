/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class IntakeSubsystem extends Subsystem {

  public WPI_VictorSPX motorSnirby = new WPI_VictorSPX(RobotMap.intakePort);

  // public WPI_VictorSPX motorKillerQueen = new WPI_VictorSPX(RobotMap.elevatorPort1);
  // public WPI_VictorSPX motorUpdog = new WPI_VictorSPX(RobotMap.elevatorPort2);

  public void set (double speed) {
    motorSnirby.set(ControlMode.PercentOutput, speed);

    // motorKillerQueen.set(ControlMode.PercentOutput, speed);
    // motorUpdog.set(ControlMode.PercentOutput, speed);
  }

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      //setDefaultCommand(new BallManually());
    }
}
