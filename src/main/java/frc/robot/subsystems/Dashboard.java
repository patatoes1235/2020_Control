package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.Robot.CurrentRobot;

public class Dashboard extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private CurrentRobot cRobot;
  public Dashboard(CurrentRobot r){
    cRobot = r;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic(){
      switch (cRobot){
        case MONOLITH:
          displayMonolith();
          break;
        case MONTY:
          break;
        case ROBOT2020:
          display2020();
          break;
      }
  }

  private void displayMonolith(){
    //write gyro angle to dashboard
    SmartDashboard.putNumber("Gyro Angle", Robot.gyro.getDeg());
  }

  private void display2020(){
    SmartDashboard.putNumber("Hotas Turn", OI.getTurn());
    SmartDashboard.putNumber("Hotas Fwd", OI.getForward());
  }

  public void addNumber(String key, double n){
    SmartDashboard.putNumber(key, n);
  }
}