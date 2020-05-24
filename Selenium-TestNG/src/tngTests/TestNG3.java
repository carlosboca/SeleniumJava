package tngTests;

import org.testng.annotations.Test;

public class TestNG3 {
	@Test(priority = 3, groups = "moto")
	public void a() {
	}

	@Test(dependsOnMethods = { "d", "e" })
	public void b() {
	}

	@Test(groups = "moto")
	public void c() {
	}

	@Test
	public void d() {
	}

	@Test
	public void e() {
	}

	@Test(dependsOnGroups = { "moto" })
	public void f() {
	}
}
