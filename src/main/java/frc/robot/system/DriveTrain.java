package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.main.RobotMap;




public class DriveTrain extends Subsystem{
CANSparkMax m_frontRight = new CANSparkMax(RobotMap.m_frontRight, MotorType.kBrushless);
CANSparkMax m_frontLeft = new CANSparkMax(RobotMap.m_frontLeft, MotorType.kBrushless);

CANSparkMax m_rearRight = new CANSparkMax(RobotMap.m_rearLeft, MotorType.kBrushless);
CANSparkMax m_rearLeft = new CANSparkMax(RobotMap.m_rearRight, MotorType.kBrushless);

    protected void initDefaultCommand(){
        m_rearLeft.follow(m_frontRight);
        m_frontRight.follow(m_frontLeft);

        m_rearLeft.close();
        m_rearRight.close();
    }

    public void teleop (double LYAxis, double RYAxis){
        m_frontLeft.set(LYAxis);
        m_frontRight.set(RYAxis);   
    }
    public double getTemp() {
        return m_frontLeft.getMotorTemperature();
    }


}
