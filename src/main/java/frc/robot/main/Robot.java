package frc.robot.main;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.subsystem.DriveTrain;
import frc.robot.subsystem.Intake;
import frc.robot.subsystem.Shooter;

/* Robot Code */
public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  DriveTrain driveTrain = new DriveTrain();
  XboxController joystick = new XboxController(0);
  Intake intake = new Intake();
  Shooter shooter = new Shooter();

  /* Robot Init */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
  }
  

  /* Auto Init */
  @Override
  public void autonomousInit() {

  }
  /* Auto Code */
  @Override
  public void autonomousPeriodic() {
    switch (m_autoSelected) {
      case kCustomAuto:
        // Put custom auto code here
        break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        break;
    }
  }
  /* Teleop Code */
  @Override
  public void teleopPeriodic() {
    driveTrain.teleop(joystick.getY(Hand.kLeft), joystick.getY(Hand.kRight));
    driveTrain.getTemp();

    intake.teleop(joystick.getAButton(), joystick.getBButton());
    
    
  }
}
