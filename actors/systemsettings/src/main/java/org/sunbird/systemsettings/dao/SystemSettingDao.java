package org.sunbird.systemsettings.dao;

import org.sunbird.common.models.response.Response;
import org.sunbird.systemsettings.model.SystemSetting;

public interface SystemSettingDao {
  /**
   * This methods inserts the given settings record into cassandra table through CassandraOperation
   * methods
   *
   * @param systemSetting instance of SystemSetting class contains the setting to be written
   * @return response instance of Response class contains the response of cassandra Dao insert
   *     operation
   */
  Response write(SystemSetting systemSetting);
  /**
   * This methods fetch the settings record using given id from cassandra table through
   * CassandraOperation methods
   *
   * @param id id of the settings record to be fetched
   * @return instance of SystemSetting class with mapped field values(id,field,value) from cassandra
   *     table
   */
  SystemSetting readById(String id);

  /**
   * This methods fetch the settings record using given id from cassandra table through
   * CassandraOperation methods
   *
   * @param field field of the settings record to be fetched
   * @return instance of SystemSetting class with mapped field values(id,field,value) from cassandra
   *     table
   */
  SystemSetting readByField(String field);
  /**
   * This methods fetches all the system settings records from cassandra table through
   * CassandraOperation methods
   *
   * @return instance of Response class with system settings from cassandra table.
   */
  Response readAll();
}
