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


public class ShootingSubsystem extends Subsystem {

  public WPI_VictorSPX motorPKFire = new WPI_VictorSPX(RobotMap.spam1Port);
  public WPI_VictorSPX motorSexPistols = new WPI_VictorSPX(RobotMap.spam2Port);

  public void set (double speed) {
    motorPKFire.set(ControlMode.PercentOutput, speed);
    motorSexPistols.set(ControlMode.PercentOutput, speed);
  }

  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
