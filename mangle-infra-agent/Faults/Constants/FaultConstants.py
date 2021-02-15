class FaultConstants(object):
    SCRIPT_ARGUMENT_PREFIX = "--"
    USER_NAME = SCRIPT_ARGUMENT_PREFIX + "userName"
    PASSWORD_KEY = SCRIPT_ARGUMENT_PREFIX + "password"
    DB_PORT = SCRIPT_ARGUMENT_PREFIX + "port"
    DB_NAME = SCRIPT_ARGUMENT_PREFIX + "dbName"
    DB_SSL_ENABLED = SCRIPT_ARGUMENT_PREFIX + "sslEnabled"
    TIMEOUT = SCRIPT_ARGUMENT_PREFIX + "timeout"
    DB_TABLE_NAME = SCRIPT_ARGUMENT_PREFIX + "tableName"
    DB_PERCENTAGE = SCRIPT_ARGUMENT_PREFIX + "percentage"
    DB_ERROR_CODE = SCRIPT_ARGUMENT_PREFIX + "errorCode"
    DB_LATENCY = SCRIPT_ARGUMENT_PREFIX + "latency"
    DB_CONNECTION_PROPERTIES_NOT_VALID = "Provided db connection properties are not valid!"
    DB_TABLE_NOT_EXIST = "Provided table doesn't exist in db '{0}'"
    DB_TRIGGER_NOT_EXIST = "Postgres Db transaction {0} fault is already running on the '{1}'.Wait until it completes if you want to inject again."
