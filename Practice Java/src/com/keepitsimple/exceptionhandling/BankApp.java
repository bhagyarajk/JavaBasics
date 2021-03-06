package com.keepitsimple.exceptionhandling;

public class BankApp {
	float balence = 0;
	float debitAmout = 0;
	float creditAmout = 0;

	public void creditAmout(float creditAmout) {
		this.creditAmout = creditAmout;
		setBalenceAfterCredit(this.creditAmout);

	}

	public void debitAmout(float debitAmout) {
		this.debitAmout = debitAmout;
		setBalenceAfterDebit(this.debitAmout);
	}

	private void setBalenceAfterDebit(float debitAmout) {

		if (debitAmout > balence) {
			throw new InsufficientBalenceAmout("Account Balence is insufficient to perform the trasaction");
		}
		balence = balence - debitAmout;

	}

	private void setBalenceAfterCredit(float creditAmout) {
		balence = balence + creditAmout;

	}

	public float getBalence() {
		return balence;
	}

}
