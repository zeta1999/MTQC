/**
 * This code is part of MTQC.
 * 
 * Copyright (c) 2020 Javier Pellejero, Luis Aguirre.
 * 
 * This code is licensed under the MIT License. You may obtain a copy 
 * of this license in the LICENSE file in the root directory of this source tree 
 * or at https://github.com/javpelle/MTQC/blob/master/LICENSE.
 */

package model.mutantoperator.qiskit;

public class RXYGate extends QiskitGate {
	@Override
	public String getName() {
		return "GateRX_GateRY";
	}

	@Override
	public String getDescription() {
		return "Replace RX gate with RY gate.";
	}

	@Override
	public String getSearchOperator() {
		return ".rx(";
	}

	@Override
	public String getMutantOperator() {
		return ".ry(";
	}

}