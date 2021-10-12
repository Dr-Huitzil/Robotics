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


public class WheelOfFortuneSubsystem extends Subsystem {

  public WPI_VictorSPX motorOverTheRainbow = new WPI_VictorSPX(RobotMap.colorPort);

  public void set (double speed) {
    motorOverTheRainbow.set(ControlMode.PercentOutput, speed);
    // {

    //   if (Math.abs(move) < 0.10) {
    //     move = 0;
    //   }
    //   if (Math.abs(turn) < 0.10) {
    //     turn = 0;
    //   }
    // }
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
