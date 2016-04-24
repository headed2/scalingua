/******************************************************************************
 * Copyright © 2016 Maxim Karpov                                              *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License");            *
 * you may not use this file except in compliance with the License.           *
 * You may obtain a copy of the License at                                    *
 *                                                                            *
 *     http://www.apache.org/licenses/LICENSE-2.0                             *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 ******************************************************************************/

package ru.makkarpov.scalingua

object Compat {
  type Context = scala.reflect.macros.Context
  def prettyPrint(c: Context)(e: c.Tree): String = c.universe.show(e)
  def termName(c: Context)(s: String): c.TermName = c.universe.newTermName(c.fresh(s))
  def typecheck(c: Context)(e: c.Tree): c.Tree = c.typeCheck(e)
}
