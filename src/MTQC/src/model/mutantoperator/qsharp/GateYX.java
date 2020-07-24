/**
 * This code is part of MTQC.
 * 
 * Copyright (c) 2020 Javier Pellejero, Luis Aguirre.
 * 
 * This code is licensed under the MIT License. You may obtain a copy 
 * of this license in the LICENSE file in the root directory of this source tree 
 * or at https://github.com/javpelle/MTQC/blob/master/LICENSE.
 */

package model.mutantoperator.qsharp;

public class GateYX extends QSharpGate {
	@Override
	public String getName() {
		return "GateY_GateX";
	}

	@Override
	public String getDescription() {
		return "Replace Y gate with X gate.";
	}

	@Override
	public String getSearchOperator() {
		return "Y(";
	}

	@Override
	public String getMutantOperator() {
		return "X(";
	}

}
