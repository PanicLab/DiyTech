package com.github.paniclab.diytech;

import com.github.paniclab.diytech.dimention.Length;
import com.github.paniclab.diytech.units.Meter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DiyTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiyTechApplication.class, args);
		Length<Meter> length1 = new Length<>(Meter.valueOf(BigDecimal.ONE));
		length1.unit();

		Length<Meter> length2 = Length.valueOf(BigDecimal.TEN, Meter::new);
	}

}
