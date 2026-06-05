package dev.brice.nudlehabittracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import dev.brice.nudlehabittracker.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@SpringBootApplication
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class NudleHabitTrackerApp {

  private static final Logger log = LoggerFactory.getLogger(NudleHabitTrackerApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(NudleHabitTrackerApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
