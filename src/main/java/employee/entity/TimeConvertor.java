package employee.entity;

import java.sql.Time;

import org.apache.johnzon.mapper.Converter;

public class TimeConvertor implements Converter<Time> {

	@Override
	public Time fromString(String value) {

		return value != null ? Time.valueOf(value) : null;
	}

	@Override
	public String toString(Time Time) {
		
		return Time != null ? Time.toString() : null;
	}
}
