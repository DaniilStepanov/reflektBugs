package io.reflekt.example

import io.reflekt.SmartReflekt
import io.reflekt.Reflekt
import FlyweightCapableTreeStructure
import FirSourceElement
import FirPsiSourceElement
import FirLightSourceElement
import PsiElement
import ASTNode
import LighterASTNode
import TokenType
import KtModifierKeywordToken
import KtModifierList
import KtModifierListOwner
import FirModifier
import FirModifierList


fun main() { 
SmartReflekt.classes<FlyweightCapableTreeStructure>().filter { true }.resolve()
SmartReflekt.classes<FirSourceElement>().filter { true }.resolve()
SmartReflekt.classes<FirPsiSourceElement>().filter { true }.resolve()
SmartReflekt.classes<FirLightSourceElement>().filter { true }.resolve()
SmartReflekt.classes<PsiElement>().filter { true }.resolve()
SmartReflekt.classes<ASTNode>().filter { true }.resolve()
SmartReflekt.classes<LighterASTNode>().filter { true }.resolve()
SmartReflekt.classes<TokenType>().filter { true }.resolve()
SmartReflekt.classes<KtModifierKeywordToken>().filter { true }.resolve()
SmartReflekt.classes<KtModifierList>().filter { true }.resolve()
SmartReflekt.classes<KtModifierListOwner>().filter { true }.resolve()
SmartReflekt.classes<FirModifierList>().filter { true }.resolve()
SmartReflekt.classes<FirModifier.FirPsiModifier>().filter { true }.resolve()
SmartReflekt.classes<FirModifier.FirLightModifier>().filter { true }.resolve()
SmartReflekt.classes<FirModifierList.FirPsiModifierList>().filter { true }.resolve()
SmartReflekt.classes<FirModifierList.FirLightModifierList>().filter { true }.resolve()
SmartReflekt.functions<Function0<FirModifierList>>().filter { true }.resolve()
SmartReflekt.functions<Function0<String>>().filter { true }.resolve()
}