package io.quantumdb.core.backends.postgresql.planner;

import io.quantumdb.core.versioning.State;
import io.quantumdb.core.versioning.Version;

public interface MigrationPlanner {

	Plan createPlan(State state, Version from, Version to);

}
