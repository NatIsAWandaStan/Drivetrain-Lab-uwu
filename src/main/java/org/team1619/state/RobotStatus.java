package org.team1619.state;

import org.uacr.robot.AbstractRobotStatus;
import org.uacr.shared.abstractions.InputValues;
import org.uacr.shared.abstractions.OutputValues;
import org.uacr.shared.abstractions.RobotConfiguration;
import org.uacr.utilities.LimitedSizeQueue;
import org.uacr.utilities.logging.LogManager;
import org.uacr.utilities.logging.Logger;

import java.util.Map;
import java.util.Queue;

/**
 * Sets flags and does global math and logic for competition bot
 */

public class RobotStatus extends AbstractRobotStatus {

	private static final Logger logger = LogManager.getLogger(RobotStatus.class);

	public RobotStatus(InputValues inputValues, OutputValues outputValues, RobotConfiguration robotConfiguration) {
		super(inputValues, outputValues, robotConfiguration);
	}

	@Override
	public void initialize() {
		// Zero
		if (!sharedInputValues.getBoolean("ipb_robot_has_been_zeroed")) {
//			sharedInputValues.setBoolean("ipb_example_has_been_zeroed", false);
		}
	}

	@Override
	public void disabledUpdate() {

	}

	@Override
	public void update() {
		if (!sharedInputValues.getBoolean("ipb_robot_has_been_zeroed")
				/*&& sharedInputValues.getBoolean("ipb_example_has_been_zeroed")*/) {
			sharedInputValues.setBoolean("ipb_robot_has_been_zeroed", true);
		}
	}

	@Override
	public void dispose() {

	}
}
