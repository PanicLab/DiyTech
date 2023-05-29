package com.github.paniclab.diytech;

import com.github.paniclab.diytech.dimention.Length;
import com.github.paniclab.diytech.dimention.Width;
import com.github.paniclab.diytech.units.Meter;
import com.github.paniclab.diytech.units.SquareMeter;
import com.github.paniclab.diytech.units.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DiyTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiyTechApplication.class, args);
		Length<Meter> length1 = new Length<>(Meter.valueOf(BigDecimal.ONE));
		length1.unit();

		Length<Meter> length2 = Length.valueOf(10, Meter::new);
		Length<Meter> length3 = length2.multiply(Value.of(2));
		Length<Meter> length4 = length1.add(length3).divide(Value.of(2));
		Width<Meter> width = Width.valueOf(10, Meter::new);
		SquareMeter squareMeter = SquareMeter.from(length1, width);
		SquareMeter squareMeter2 = SquareMeter.from(length2, length2);
	}

}
