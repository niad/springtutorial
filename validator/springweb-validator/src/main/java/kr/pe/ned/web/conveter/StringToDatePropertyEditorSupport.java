package kr.pe.ned.web.conveter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ned
 * @since 2017.05.02
 */
public class StringToDatePropertyEditorSupport extends PropertyEditorSupport {

	private java.text.SimpleDateFormat dateFormat;

	public StringToDatePropertyEditorSupport(java.text.SimpleDateFormat simpleDateFormat) {
		this.dateFormat = simpleDateFormat;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.isBlank(text)) {
			return;
		}

		Date date = null;
		try {
			date = dateFormat.parse(text);
		} catch (ParseException e) {
			// parsing 중 오류가 발생하면 어떤 처리도 하지 않는다.
		}
		setValue(date);
	}

	@Override
	public String getAsText() {
		Date value = (Date) getValue();
		return (value != null ? this.dateFormat.format(value) : "");
	}

}
