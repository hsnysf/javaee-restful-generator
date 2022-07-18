package employee.entity;

import java.sql.Timestamp;

import org.apache.johnzon.mapper.Converter;

public class TimestampConvertor implements Converter<Timestamp> {

	@Override
	public Timestamp fromString(String value) {
		
		return value != null ? Timestamp.valueOf(value) : null;
	}

	@Override
	public String toString(Timestamp timestamp) {

		return timestamp != null ? timestamp.toString() : null;
	}

}
