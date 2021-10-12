/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;


public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem here. Call these from Commands.

  private static final double _0_6 = 0.6;
// instantiate new motor controller objects
  public WPI_VictorSPX leftMaster = new WPI_VictorSPX(RobotMap.leftMasterPort);
  public WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.leftSlavePort);
  public WPI_VictorSPX rightMaster = new WPI_VictorSPX(RobotMap.rightMasterPort);
  public WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.rightSlavePort);


  private double speed = 0.6;
  private double turning = _0_6;


  // instantiate a new differentialdrive object
  // assign motor controllers to differential drive
  public DifferentialDrive drive = new DifferentialDrive(rightMaster, leftMaster);


  // create constructor function
  public DriveSubsystem() {
    // point slaves to masters 
    rightSlave.follow(rightMaster);
    leftSlave.follow(leftMaster);
  
   }

  // add manualDrive() method
  public void manualDrive(double move, double turn) {

    if (Math.abs(move) < 0.10) {
      move = 0;
    }
    if (Math.abs(turn) < 0.10) {
      turn = 0;
    }

    drive.arcadeDrive(move * speed, turn * turning);

  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new DriveManuallyCommand());
    setDefaultCommand(new DriveManuallyCommand());
  }
}
