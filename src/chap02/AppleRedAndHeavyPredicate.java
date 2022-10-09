package chap02;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "red".equals(apple.getColor())
			&& apple.getWeight() > 150;
	}
}
