package com.cgs.db.meta.retriever;

import java.util.Map;
import java.util.Set;

import com.cgs.db.meta.core.SchemaInfoLevel;
import com.cgs.db.meta.schema.Constraint;
import com.cgs.db.meta.schema.Function;
import com.cgs.db.meta.schema.Procedure;
import com.cgs.db.meta.schema.SchemaInfo;
import com.cgs.db.meta.schema.Table;
import com.cgs.db.meta.schema.Trigger;

public class DefaultMetaCrawler extends AbstractMetaCrawler {

	public Set<SchemaInfo> getSchemaInfos() {
		throw new UnsupportedOperationException();
	}

	public Procedure getProcedure(String procedureName) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Procedure> getProcedures() {
		throw new UnsupportedOperationException();
	}

	public Set<String> getTriggerNames() {
		throw new UnsupportedOperationException();
	}

	public Trigger getTrigger(String triggerName) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Trigger> getTriggers() {
		throw new UnsupportedOperationException();
	}

	public Set<String> getFunctionNames() {
		throw new UnsupportedOperationException();
	}

	public Function getFunction(String name) {
		throw new UnsupportedOperationException();
	}

	public Map<String, Function> getFunctions() {
		throw new UnsupportedOperationException();
	}

	@Override
	protected Table invokeCrawlTableInfo(String tableName, SchemaInfoLevel level) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected Map<String, Constraint> crawlConstraint(String tableName, SchemaInfo schemaInfo) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected Map<String, Trigger> crawleTriggers(String tableName, SchemaInfo schemaInfo) {
		throw new UnsupportedOperationException();
	}

}
