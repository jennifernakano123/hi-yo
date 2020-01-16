package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.main.RobotMap;


public class Intake extends Subsystem{
CANSparkMax m_arm_rotator = new CANSparkMax(RobotMap.m_arm_rotator, MotorType.kBrushless);


@Override
    protected void initDefaultCommand() {
    

    }
    public void teleop(boolean button1, boolean button2) {
    if(button1) {
        m_arm_rotator.set(1);
    }
    else if(button2) {
        m_arm_rotator.set(-1);
    }
    else {
        m_arm_rotator.set(0);
    }
  }
}
