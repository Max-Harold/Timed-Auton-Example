// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.chassis;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
  // motors
  private WPI_TalonFX L_Motor;
  private WPI_TalonFX R_Motor;

  // Differential drive
  private DifferentialDrive drive;

  /** Creates a new Chassis. */
  public Chassis() {
    // initialise and invert the motors
    L_Motor = new WPI_TalonFX(Constants.L_MOTOR_ID);
    L_Motor.setInverted(true);
    R_Motor = new WPI_TalonFX(Constants.R_MOTOR_ID);
    R_Motor.setInverted(true);

    drive = new DifferentialDrive(L_Motor, R_Motor);
  }

  @Override
  public void periodic() {
    drive.feed();
  }


  public void forward(double fwd) {
    drive.arcadeDrive(fwd, 0);
  }

  public void turn(double theta) {
    drive.arcadeDrive(0, theta);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
