/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.I2C;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.commands.DriveManuallyCommand;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShootingSubsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Timer;


public class Robot extends TimedRobot {
  // public static ExampleSubsystem m_subsystem = new ExampleSubsystem();
  public static final DriveSubsystem driveSubsystem = new DriveSubsystem();
  public static final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  public static final ShootingSubsystem shootingSubsystem = new ShootingSubsystem();
  public static final ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  public static DigitalInput limitSwitch = new DigitalInput(4);
  public static final DriveManuallyCommand m_driveManuallyCommand = null;
  public static OI m_oi;

  //private final I2C.Port i2cPort = I2C.Port.kOnboard;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
    m_oi = new OI();

    SmartDashboard.putData("Auto mode", m_chooser);
    CameraServer.startAutomaticCapture();    
  }

  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
    
  }

//public static Object driveSubsystem;
//public static Object oi;


  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  // the main robot motors
 private WPI_VictorSPX leftMaster = new WPI_VictorSPX(RobotMap.leftMasterPort);
 private WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.leftSlavePort);
 private WPI_VictorSPX rightMaster = new WPI_VictorSPX(RobotMap.rightMasterPort);
 private WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.rightSlavePort);

// the intake motor
 private WPI_VictorSPX motorSnirby = new WPI_VictorSPX(RobotMap.intakePort);

// the shooting motor
 public WPI_VictorSPX motorPKFire = new WPI_VictorSPX(RobotMap.spam1Port);
 public WPI_VictorSPX motorSexPistols = new WPI_VictorSPX(RobotMap.spam2Port);
 public WPI_VictorSPX motorOverTheRainbow = new WPI_VictorSPX(RobotMap.spam3Port);

private double startTime;


  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();
    startTime = Timer.getFPGATimestamp();


    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }


  @Override
  public void autonomousPeriodic() 
  {
    Scheduler.getInstance().run();
    double time = Timer.getFPGATimestamp();
    System.out.println(time - startTime);

      if (time - startTime > 4 && time - startTime < 8)
       {
        leftMaster.set(0.4);
        leftSlave.set(0.4);
        rightMaster.set(-0.4);
        rightSlave.set(-0.4);

        motorSnirby.set(1.0);

        motorPKFire.set(1.0);
        motorSexPistols.set(1.0);

        motorOverTheRainbow.set(-1.0);
       }
      else
      
      {
        leftMaster.set(0);
        leftSlave.set(0);
        rightMaster.set(0);
        rightSlave.set(0);
        motorSnirby.set(0);
        motorPKFire.set(0);
        motorSexPistols.set(0);
        motorOverTheRainbow.set(0);
      }
    }

  @Override
  public void teleopInit() {

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testInit()
  {
    
  }


  @Override
  public void testPeriodic() {
  }
}
