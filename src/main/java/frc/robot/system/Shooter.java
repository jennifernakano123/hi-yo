package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.main.RobotMap;


public class Shooter extends Subsystem{
CANSparkMax m_shooter = new CANSparkMax(RobotMap.m_shooter, MotorType.kBrushless);


@Override
  protected void initDefaultCommand() {
    

  }
  public void shooter(boolean button1) {
    if(button1) {
      m_shooter.set(1);
    }
    else if(!button1) {
      m_shooter.set(-1);
    }
    else {
      m_shooter.set(0);
    }
  }
}
