package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.LiftManuallyCommand;

public class LiftSubsystem extends Subsystem {


  private static final double _0_5 = 0.5;
// instantiate new moto controller objects
  public WPI_VictorSPX elevatorPort = new WPI_VictorSPX(RobotMap.elevatorPort);

  private double speed = 0.5;
  private double turning = _0_5;
  

  //instantiate a new differentialdrive object
  // assign motor controllers to difrential drive
  public DifferentialDrive drive = new DifferentialDrive(elevatorPort, elevatorPort);

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
      setDefaultCommand(new LiftManuallyCommand());
    }

}